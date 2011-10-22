;Not working (it's expected) StackOverflow
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

(defn new-if [predicate then-clause else-clause] 
	(cond 
		predicate then-clause 
		:else else-clause
	)
)

(defn sqrt-iter [guess x] 
	(new-if (good-enough guess x) 
		guess 
		(sqrt-iter (improve guess x) x)
	)
)

(defn sqrt [x] (sqrt-iter 1.0 x))

(printf "%.4f" (sqrt 3))