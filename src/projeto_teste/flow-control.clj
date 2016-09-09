(defn is-small [number]
  (if (< number 100) "yes" "no")
)

(defn is-small-using-do [number]
  (if (< number 100)
    "yes"
  (do
    (println "Saw a big number" number)
    "no"))
)
(defn test-loop-recur []
  (loop [result [] x 5]
    (if (zero? x)
      result
      (recur (conj result x) (dec x))
    )
  )
)
