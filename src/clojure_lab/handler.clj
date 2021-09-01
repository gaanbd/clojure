(ns clojure-lab.handler
  (:require [compojure.api.sweet :refer :all]
            [compojure.route :as route]
            [ring.util.http-response :refer [ok not-found]]
            [schema.core :as s]
            [clojure.data.json :as json]
            [ring.middleware.defaults :refer [wrap-defaults api-defaults]]))

; This is a schema definition.  These are commonly used in API definitions to validate incoming/outgoing
;   payloads.  This schema is used in a health check resource below.
;
; The schema definition below is saying that a JSON object will be returned with a single field named status
;   which is a string value.
; Schema definitions are optional if you do not want to validate any incoming or outgoing payloads
(s/defschema
  HealthCheck
  {:status (describe s/Str "The health status of the health check")})

(defapi
  app-routes
  ;The following map defines the swagger API documentation information on how to acccess it and how it will be displayed
  {:swagger
   ; This specifies the URI to hit to see the swagger UI
   {:ui      "/"
    ; This specified the URI to hit to get the json schema for the swagger documentation
    :spec    "/swagger.json"
    :options {:ui {:validatorUrl nil}}
    :data    {:info     {:title       "Clojure Lab"
                         :version     "1.0"
                         :description "This is a lab to learn clojure and the compojure API library using ring"
                         :contact     {:name  "Predictions Team"
                                       :email "DevCloudPredictions@genesys.com"}}
              :consumes ["application/json"]
              :produces ["application/json"]
              :tags     [{:name "healthcheck", :description "API Health Check"}
                         {:name "labendpoint" :description "Endpoints created during the lab"}
                         ]}}}

  ; Below is a sample
  (context "/health/check" []
    :tags ["HealthCheck"]
    (GET "/" []
      :description "This endpoint check the health status"
      :summary "return health status"
      :responses {200 {:schema HealthCheck
                       :description "OK"}}
      (ok {:status "Healthy"})))

  (undocumented
    (route/not-found (not-found {:status "Not Found"}))))

; This is the definition of the ring handler.
; It loads the API definitions and also utilizes the wrap-default middleware to wrap the handlers in some default API
;   behaviors.
; Have a look at project.clj.  This is where ring is configured to use this app as the handler.
(def app
  (-> app-routes
      (wrap-defaults api-defaults)))

; A good resource for these labs is to use the compojure-api documentation:
; https://github.com/metosin/compojure-api

; Lab 1
; Create middleware that logs all request and response information.
; Add this middleware to the app definition above
; Run the service and run the health check endpoint to test it out

; Lab 2
; Create an endpoint to be able to POST a payload to write a file with given contents to the temp directory.
; The schema for the JSON body will include:
; filename - required - string value for the name of a file
; contents - required - any string value
; The POST response schema should be the following:
; filepath - required - The full filepath of the file written
;
; Example:
; POST http://localhost:10101/store
; {
;   "filename": "file.txt",
;   "contents": "This is the file contents to write"
; }
;
; Should write "This is the file contents to write" to "$TMPDIR/file.txt" then return
; {
;   "filepath": "$TMPDIR/file.txt"
; }