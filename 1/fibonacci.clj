(def fibs (lazy-cat [0 1] (map + fibs (rest fibs))))

(defn fib-rec [n] 
	(cond 
		(= n 0) 	0 
		(= n 1) 	1 
		:else 		(+ 
						(fib-rec (- n 1)) 
						(fib-rec (- n 2))
					)
	)
)

(defn fib-it [n] 
	(defn fib-iter [a b count] 
		(if (= count 0) 
			b 
			(fib-iter 
				(+ a b) 
				a 
				(- count 1)
			)
		)
	) 
	(fib-iter 1 0 n)
)

(println (time (fib-it 10)))

(println (time (nth fibs 10)))

(println (time (fib-rec 10)))