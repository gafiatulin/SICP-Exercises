(defn f-rec [n] 
	(if (< n 3) 
		n 
		(+ 
			(f-rec (- n 1)) 
			(f-rec (- n 2)) 
			(f-rec (- n 3))
		)
	)
)

(defn f-it [n] 
	(defn f-iter [a b c it] 
		(cond 
			(= it 1) c 
			(= it 2) b 
			(= it 3) a 
			(> it 3) (f-iter (+ a b c) a b (- it 1))
		)
	) 
	(f-iter 3 2 1 n)
)

(println (time (f-it 10)))
(println (time  (f-rec 10)))