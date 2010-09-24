;; ACTIVATION FUNCTIONS
(ns nn.state-funcs
  (:refer-clojure))

(defn weight []
  (fn [xs]
    `(* ~@xs)))

(defn signum--1+1 []
  (fn [xs]
    `(if (< (+ ~@xs) 0) 
       -1
       1)))
(defn signum-0+1 []
  (fn [xs]
    `(if (< (+ ~@xs) 0.5)
       0
       1)))

(defn logistic--1+1 [c]
  (fn [xs]
    `(+ (- 1) 
	(* 2 (/ 1.0
		(+ 1 (Math/exp (* (- ~c) (+ ~@xs)))))))))
(defn logistic-0+1 [c]
  (fn [xs]
    `(/ 1 (+ 1 (Math/exp (* (- ~c) (+ ~@xs)))))))



;; (defn sf-keyword->sf-name [k]
;;   (cond (= k :signum-+1-1) 'nn.activation/signum-+1-1
;; 	(= k :logistic-+1-1) 'nn.activation/logistic-+1-1
;; 	(= k :*) '*
;; 	(= k :+) '+))
	
