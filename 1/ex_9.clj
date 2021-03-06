(ns namespace.a)
	(defn + [a b] 
		(if(= a 0) 
			b 
			(inc(+ (dec a) b))
		)
	)
	(+ 4 5)

(ns namespace.b)
	(defn + [a b] 
		(if (= a 0) 
			b 
			(+ (dec a) (inc b))
		)
	)
	(+ 4 5)

(ns user)