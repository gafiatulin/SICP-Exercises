(defn square [x] (* x x))

(defn pow-opt [a n]
	(cond 
		(= n 0) 	1
		(even? n) 	(square (pow-opt a (/ n 2)))
		:else 		(* a (pow-opt a (- n 1)))
	)
)

(defn fast-pow [a n]
	(defn fast-pow-iter [k a n]
		(if (= n 0)
			k
			(if (even? n)
				(fast-pow-iter 
					k 
					(square a) 
					(/ n 2)
				)
				(fast-pow-iter 
					(* k a) 
					a 
					(- n 1)
				)
			)
		)
	)
	(fast-pow-iter 1 a n)
)

(println (time(pow-opt 9 10000)))
(println (time(fast-pow 9 10000)))