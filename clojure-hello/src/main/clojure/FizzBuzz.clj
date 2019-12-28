; License Apache License, Version 2.0
; @author lxb
(ns FizzBuzz
      (:gen-class))

(defn -main [& args] 
  (def n (Integer/parseInt (first args)))
  (loop [x 1]
    (when (<= x n)
      (println 
        (cond
          (and (= (mod x 3)0) (= (mod x 5) 0)) "FizzBuzz"
          (=(mod x 3 ) 0) "Fizz"
          (=(mod x 5 )0 ) "Buzz"
          :else x
        )
      )
    (recur (+ x 1))))
)