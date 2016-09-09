(defn uso-de-filter
  []
  (println (filter even? (range 10)))
  (println (filter even? [4,5,6])))

(defn uso-de-first
  []
  (println (first [4,5,6])))

(defn uso-de-map
  []
  (println (map * [20,20,20] [40,50,60] (range 3)))
  (println (map #(str "itanor " % ) [1,2,3])))

(defn uso-de-some
  []
  (some true? [false,false,true]))
