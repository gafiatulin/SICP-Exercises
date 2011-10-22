(defn abs [x] 
	(cond 
		(< x 0) (- x) 
		(> x 0) x 
		:else 0
	)
)

(defn cube [x]
	(* x x x)
)

(defn p [x] 
	(-
		(* 3 x)
		(*
			4
			(cube x)
		)
	)
)

(defn sine-rec [angle]
	( if-not (> (abs angle) 0.1)
		angle
		(p (sine-rec (/ angle 3)))		
	)
)

(println (time (sine-rec 12.15)))