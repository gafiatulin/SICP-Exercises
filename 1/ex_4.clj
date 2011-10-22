(defn a-plus-abs-b [a b] 
	((if (> b 0) + -) a b)
)
(print (a-plus-abs-b 2 -3))
