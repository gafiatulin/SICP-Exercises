(defn pas-tri [i j] (cond (or (> j i) (or (< j 1) (< i 1))) "Invalid" (or (= j 1) (= j i)) 1 :else (+ (pas-tri (- i 1) (- j 1)) (pas-tri (- i 1) j))))
