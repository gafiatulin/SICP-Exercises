(defn abs [x] 
	(cond 
		(< x 0) (- x) 
		(> x 0) x 
		:else 0
	)
)

(defn square [x] (* x x))

(defn average [x y] 
	(/ 
		(+ x y) 
		2
	)
)

(defn good-enough [guess x] 
	(< 
		(abs(- (square guess) x)) 
		0.0001
	)
)

(defn improve [guess x] 
	(average guess (/ x guess))
)

(defn sqrt-iter [guess x] 
	(if(good-enough guess x) 
		guess 
		(sqrt-iter (improve guess x) x)
	)
)

(defn sqrt [x] 
	(sqrt-iter 1.0 x)
)