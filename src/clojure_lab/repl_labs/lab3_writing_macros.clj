(ns clojure-lab.repl-labs.lab3-writing-macros)

; Do all work in this file, then use (Option+Shift+P) to send the current
;  highlighted statement to the REPL

; Make sure your REPL is launched and switch to this file's namespace (Option+Shift+R).
; Now load the file into the REPL (Option+Shift+L).

; Macros are a way to create code by using code.  Since code is defined as lists of
; expressions to get evaluated, you can use this to define macros that can be used
; exactly like functions.
; This example macro is the opposite of a simple if statement where,
; if cond is false, then the body gets evaluated, otherwise it returns nil.
(defmacro unless [cond & body] (list 'if (list 'not cond) (cons 'do body)))

; 1. Calling macros
; Macros are used and called exactly like functions
; Use the unless macro above to

; 2. macroexpand
; Now use macroexpand to evaluate the above call to the macro.
; Hint: remember to quote the code so it doesn't get evaluated by the compiler

; Like most things in clojure, there are easier, more compact ways to accomplish
; writing macros.
; ` is the way to quote macros so code is not evaluated
; Inside `, you can use ~ to get to the outer scope
; Also, you can expand list variables using ~@
;
; As you can see, this is much more readable than the above macro while accomplishing
; the exact same behavior
(defmacro unless2 [cond & body] `(if (not ~cond) (do ~@body)))

; 3. Write a macro
; Write a macro called infix which allows you to do specify math in infix notation
; Example:
; (infix (1 + 1))
; => 2
; Uncomment below and complete
;(defmacro infix [infixed]
;  )

