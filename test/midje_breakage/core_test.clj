(ns midje-breakage.core-test
  (:require [midje.sweet :refer [facts fact =>]]))

(defmacro spam-tests [n]
  `(facts "About spam"
      ~@(replicate n `(fact "It's not ham" "spam" => "spam"))))

(spam-tests 1000)
