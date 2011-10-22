(defn pow-rec [a n]
	(if (= n 0)
		1
		(* 
			a 
			(pow-rec a (- n 1))
		)
	)
)

(defn pow-it [a n]
	(defn iter [a n product]
		(if (= n 0)
			product
			(iter 
				a
				(- n 1)
				(* a product)
			)
		)
	)
	(iter a n 1) 
)

(defn square [x] (* x x))

(defn pow-opt [a n]
	(cond 
		(= n 0) 	1
		(even? n) 	(square (pow-opt a (/ n 2)))
		:else 		(* a (pow-opt a (- n 1)))
	)
)

(println (time(pow-opt 7 1000)))

(println (time(pow-rec 7 1000)))

(println (time(pow-it 7 1000)))
