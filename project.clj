(defproject clojure-lab "0.1.0-SNAPSHOT"
  :description "Labs for learning clojure and ring/compojure frameworks"
  :url "http://localhost"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure     "1.8.0"]
                 [metosin/compojure-api   "1.1.10"]
                 [compojure               "1.6.1"]
                 [org.clojure/data.json   "0.2.6"]
                 [ring/ring-defaults      "0.3.2"]]
  :plugins [[lein-ring "0.12.4"]]
  :ring {:handler clojure-lab.handler/app
         :port 10101
         :nrepl {:start? true :port 10102}}

  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}}
  :aliases {"run-local"      ["ring" "server-headless"]})
