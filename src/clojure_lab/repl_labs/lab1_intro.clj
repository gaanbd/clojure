(ns clojure-lab.repl-labs.lab1-intro
  (:require [clojure.data.json]))

; These defs will be used later in the lab
(def some-numbers '(1 2 3 4 5 6 9))

; Do all work in this file, then use (Option+Shift+P) to send the current
;  highlighted statement to the REPL

; Make sure your REPL is launched and switch to this file's namespace (Option+Shift+R).
; Now load the file into the REPL (Option+Shift+L).

; 1. Let's start using the REPL to evaluate some simple expressions
; First try a simple addition of 1 and 2:

; 2. Simple arithmetic functions are also variadic, meaning they accept
; 1 or more
; Now try adding the numbers 1, 3, 4, 6 and 8

; 3. Variadic functions can also be used with sequences by using (apply)
; Try using (apply) to add the numbers in 'some-numbers' list defined above

; 4. Let vs def
; Let defines a local binding for symbols
; Def defines a global binding for symbols (within the namespace)
; Uncomment the following lines to see how global and local bindings work
;(def me "Bruce Wayne")
;(let [me "Batman"
;      you "Joker"]
;  (println me)
;  (println you))
;(println me)
;(println you)

; 5. Requires
; Before proceeding, lets look at the require statements above
; require loads the listed libraries for use in the current namespace
; There are a few variations being used here:

; :as x - This loads the library and aliases the namespace to x.  Functions can be
;         called using (x/function-name)
; :refer [x y] - This loads the library and loads the symbols listed from the namespace
;                You can access x and y directly without prefixing with a namespace
; :refer :all - This loads the library and loads all public symbols from the namespace
;               This is rarely recommended but sometimes useful for namespaces with
;                 a low number of unique public symbols
;
; Modify the namespace definition above to load clojure.string and alias it as str.
; Then call the reverse function in the clojure.str namespace to reverse the string "apple"


