(defn factorial [n] 
	(defn iter [product counter]
		(if (> counter n) product  (iter (* counter product) (+ counter 1)))
	)
	(iter 1 1)
)