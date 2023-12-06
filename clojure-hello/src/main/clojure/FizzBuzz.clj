;
; Copyright 2017-2023 lxb.
;
; Licensed under the Apache License, Version 2.0 (the "License");
; you may not use this file except in compliance with the License.
; You may obtain a copy of the License at
;
;      http://www.apache.org/licenses/LICENSE-2.0
;
; Unless required by applicable law or agreed to in writing, software
; distributed under the License is distributed on an "AS IS" BASIS,
; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
; See the License for the specific language governing permissions and
; limitations under the License.
;
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