(defn binomial-coefficient [i j] 
	(cond 
		(or (> j i) (or (< j 1) (< i 1)))	"Invalid" 
		(or (= j 1) (= j i))				1 
		:else
											(+ 
												(binomial-coefficient (- i 1) (- j 1)) 
												(binomial-coefficient (- i 1) j)
											)
	)
)

(defn pas-triangle-line [n] 
	(for [x (range 1 (+ n 1))]  
		(binomial-coefficient n x)
	)
)

(defn pas-triangle [n] 
	(for [x (range 1 (+ n 1))] 
		(pas-triangle-line x)
	)
)

(defn print-pas-triangle [n] 
	(doseq [x (range 1 (+ n 1))] 
		(doseq [y (range 1 (+ x 1))] 
			( if (not= x y) 
				(printf "%s " (binomial-coefficient x y)) 
				(printf "%s\n" (binomial-coefficient x y))
			)
		)
	)
)

(print-pas-triangle 10)