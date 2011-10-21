(def fibs (lazy-cat [0 1] (map + fibs (rest fibs))))
(println (nth fibs 10))