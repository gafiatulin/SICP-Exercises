(defn hlv [x] (/ x 2))

(defn dbl [x] (* x 2))

(defn fast-mul-rec [x y]
	(cond 
		(or (= x 0) (= y 0)) 0
		(= y 1) x
		(even? y) (dbl(fast-mul-rec x (hlv y)))
		:else (+ x (fast-mul-rec x (- y 1)))
	)
)

; ab+c = const

(defn fast-mul-it [a b]
	(defn fas-mul-iter [a b c]
		(cond
			(= a 0) 	0
			(= b 0) 	c
			(even? b)	(fas-mul-iter (dbl a) (hlv b) c)
			:else		(fas-mul-iter a (- b 1) (+ c a))
		)
	)
	(fas-mul-iter a b 0)
)



(println (time (* 2324343535354657586875646427 65788945363456645564756758756435467756588743687654)))

(println (time (fast-mul-it 2324343535354657586875646427 65788945363456645564756758756435467756588743687654)))

(println (time (fast-mul-rec 2324343535354657586875646427 65788945363456645564756758756435467756588743687654)))