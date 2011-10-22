(defn hlv [x] (/ x 2))

(defn dbl [x] (* x 2))

(defn mul [x y]
	(if (= y 0)
		0
		(+
			x
			(mul x (- y 1))
		)
	)
)

(defn fast-mul [x y]
	(cond 
		(or (= x 0) (= y 0)) 0
		(= y 1) x
		(even? y) (dbl(fast-mul x (hlv y)))
		:else (+ x (fast-mul x (- y 1)))
	)
)

(println (time (* 232434 5319)))
(println (time(fast-mul 232434 5319)))
(println (time(mul 232434 5319)))