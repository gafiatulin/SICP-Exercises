(defn sup-fast-fib [n] 
	(defn square [x] (* x x))
	(defn fib-iter [a b p q counter]
		(cond
			(= counter 0) 	b
			(even? counter) 
							(fib-iter
								a
								b
								(+ 
									(square p) 
									(square q)
								)
								(+
									(square q)
									(* 2 p q)
								)
								(/ counter 2)
							)
			:else 			
							(fib-iter
								(+ 
									(* b q) 
									(* a q) 
									(* a p)	
								)
								(+
									(* b p)
									(* a q)
								)
								p
								q
								(- counter 1)
							)
							
		)
	)
	(fib-iter 1 0 0 1 n)
)

(def n 200)
(if (< n 20)
	(println n)
	(spit "output" (sup-fast-fib n))	
)

