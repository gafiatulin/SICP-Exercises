(defn square [x] (* x x))
(defn myFn [x y z] (+ (square (max x y))( square (max (min x y) z))))