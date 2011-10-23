;18 mod in normal-order evaluation and 4 in applicative-order
(defn gcd [a b]
	(if (= b 0)
		a
		(gcd b (mod a b))
	)
)

(println (gcd 99 22))