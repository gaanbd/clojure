(ns clojure-lab.repl-labs.lab2-writing-functions)

; Function to be used later in this lab
(defn string->integer
  "Turns a string into an integer using the numeric base given"
  [str base]
  (Integer/parseInt str base))

; Do all work in this file, then use (Option+Shift+P) to send the current
;  highlighted statement to the REPL

; Make sure your REPL is launched and switch to this file's namespace.
; defn is the macro in clojure commonly used to make

; 1. Write a function named (hello) that prints "Hello world" to the REPL
; Test it by sending this to the REPL
; (hello)

; 2. Write a function named (hello-v2) that prints "Hello " followed by a persons name as a parameter
; (hello-v2 "Bob")

; 3. Now lets combine those 2 functions into a single multi arity function named (hello-v3)
;    named hello-v3 which takes either 0 or 1 parameters and has the behaviors
;    outlined above.
; (hello-v3)
; (hello-v3 "Bob")

; 4. Now lets make an even better hello-v4 by defining it as variadic.
; Variadic functions take an infinite number of parameters as a seqable
; Also, when no args are given, it should print "Hello World"
; Examples:
; (hello-v4)
; => "Hello World"
; (hello-v4 "Bob")
; => "Hello Bob"
; (hello-v4 "Bob" "Travis" "Bayu")
; => "Hello Bob Travis Bayu"

; 5. Destructing
;    Destructing is not strictly a way to define functions, but is very handy
;       for creating optional key value arguments to functions
;    Create a function named str->integer that will turn a single string to an integer
;    Use string->integer above to do the conversion
;    Use key destructuring to allow an optional parameter named :base that will
;       override a default value of 10
;    Use https://clojure.org/guides/destructuring#_keyword_arguments
;      for how to use keyword arguments in functions
;    Examples:
;    (str->integer "111")
;    => 111
;    (str->integer "111" :base 8)
;    => 73

; 6. Anonymous functions
;    Anonymous functions can be defined a few ways.
;    1. (fn [x y] (println x y))
;    2. #(println %1 %2)
;    The last method works when there is only a single parameter.
;    e.g. To square a value
;    3. #(println %)
;
;    Write an anonymous function to square a value
;    Assign the function to a symbol (def), then invoke the function to square the value 8


