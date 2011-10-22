(defn factorial-rec [n] 
	(if (= n 1) 
		1 
		(* 
			n 
			(factorial-rec 
				(- n 1)
			)
		)
	)
)

(defn factorial-it [n] 
	(defn iter [product counter]
		(if (> counter n) 
			product  
			(iter 
				(* counter product) 
				(+ counter 1)
			)
		)
	)
	(iter 1 1)
)

(println (time (factorial-rec 10)))
(println (time (factorial-it 10)))