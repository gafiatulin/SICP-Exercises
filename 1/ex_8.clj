(defn abs [x] 
	(cond 
		(< x 0) (- x) 
		(> x 0) x 
		:else 0
	)
)

(defn cube [x] (* x x x))

(defn square [x] (* x x))

(defn average [x y] 
	(/ 
		(+ x y) 
		2
	)
)

(defn improve [guess x] 
	(/ 
		(+ 
			(/ 
				x 
				(square guess)
			) 
			(* 2 guess)
		) 
		3
	)
)

(defn good-enough [guess x] 
	(< 
		(abs(- (cube guess) x)) 
		0.00001
	)
)

(defn sbrt-itter [guess x] 
	(if(good-enough guess x) 
		guess 
		(sbrt-itter (improve guess x) x)
	)
)

(defn cbrt [x] (sbrt-itter 1.0 x))

(printf "%.4f\n" (cbrt 7))
