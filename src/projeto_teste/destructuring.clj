(defn greet-author-1 [author]
  (println "Hello," (:first-name author))
)
(defn greet-author-2 [{fname :first-name}]
  (println "Hello," fname)
)
(defn first-two-dimensions []
  (let [[x y] [1 2 3]] [x y])
)
(defn first-two [vector]
  (let [[first second] vector]
    [first second])
)
(defn last-only [vector]
  (let [[_ _ last] vector]
    last)
)
(defn collection-and-elements []
  (let [[x y :as coords] [1 2 3 4 5 6]]
    (str "x: " x ", y: " y ", total dimensions: " (count coords))
  )
)
(defn ellipsize [words]
  (let [[w1 w2 w3] (.split #"\s+" words)]
    (str w1 " " w2 " " w3 "...")
  )
)
