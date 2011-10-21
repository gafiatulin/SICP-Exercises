(defn A [m n]
	(cond (= m 0) (+ n 1) (and (= n 0) (> m 0)) (A (- m 1) 1) (and (> m 0) (> n 0)) (A (- m 1) (A m (- n 1))))	
)
(defn f [n] (A 1 n)) ; f ~ n+2
(defn g [n] (A 2 n)) ; g ~ 2n+3
(defn h [n] (A 3 n)) ; h ~ 2^(n+3)-3