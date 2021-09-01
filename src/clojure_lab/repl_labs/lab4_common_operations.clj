(ns clojure-lab.repl-labs.lab4-common-operations)

; Do all work in this file, then use (Option+Shift+P) to send the current
;  highlighted statement to the REPL

; Make sure your REPL is launched and switch to this file's namespace (Option+Shift+R).
; Now load the file into the REPL (Option+Shift+L).

(def test-map {:title "Some Book"
               :author "Fred"
               :genre "Nonfiction"
               :chapters {1 "Introduction"
                          2 "Middle"
                          3 "End"}})
(def test-set #{1 3 4 7 11 14})
(def test-vector ["red" "orange" "yellow" "green" "blue" "purple" "brown" "grey"])
(def test-list '(4.7 8.2 7.7 13.6 8.1))
(def test-map2 {:title "Some book"
                :cost  10.0})

; 1. Getting values from data structures
; a. Use (select-keys) to get a map containing just the title and author from test-map

; b. Use (get-in) to get the title of chapter 2 from test-map

; c. Use (into) or (merge) to merge test-map with test-map2, keeping the title from test-map

; d. Use (first) to get the first element from a structure.  Try on each different data structure.

; e. Use (nth) to get the 3rd element from a structure.  This is 1-based.  Try on test-vector and test-list.

; f. Use (get) or the keyword function itself to retrieve the title from test-map

; 2. Adding/removing from data structures
; Remember, all clojure types are immutable.  None of these operations change the defs above.
; a. Use (conj) to add the value 1 to both the test-list and test-vector. Notice the difference.
;    conj uses the most efficient method of adding elements to a given collection.

; b. Use (into), (merge) and/or (conj) to merge test-map and test-map2, keeping the title from test-map

; c. Use (assoc) to add :pages 200 to test-map

; d. Use (disj) to remove an element from a test-set

; e. Use (dissoc) to remove the :chapters information from test-key

; 3. Other data manipulation
; a. Use (filter) to select values from test-list greater than 8.0

; b. Use (partition) to partition test-vector into groups of 2 elements

; c. Use (group-by) to group the colors in test-vector by their first letter

; d. Use (map) to get a sequence of all of the values from test-set incremented by 1

; e. Use (reduce) to get the sum of all the values in test-set

; f. Use (some) to find the first value greater than 8 in test-list

; 4. Threading macro
; In the previous sections, we learned how to manipulate data structures using
;  single function calls.  However, most applications are doing much more complex
;  data manipulations that involves nesting multiple function calls to achieve the
;  result you need.  This is where threading macros become important.
; (->) is the thread-first macro which will take the result of the first evaluation,
;  then threads that result as the first argument to the next evaluation, and that
;  threading continues to the end
; (->>) is the thread-last macro which does the same except it threads the result as the
;  last argument to each evaluation

; Consider the following evaluation which takes the first 4 items from the list,
;  squares them, then adds them together
(reduce + (map #(* % %) (take 4 test-list)))
; Rewrite the above code using the thread-last macro
; Pay attention to the readability difference before and after




