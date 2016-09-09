(defn imprime-parametro
  [param]
  (println (str "Parametro = " param)))

(defn uso-de-if
  [param]
  (if param
    "retorno em caso verdadeiro"
    "retorno em caso falso"))

(defn uso-de-do
  "Used to have multiple statements in if/else..."
  [param]
  (if param
    (do (println "printing if true") "return true")
    (do (println "printing if false") "return false")))

(defn uso-de-when
  "A combination with if and do without else..."
  [param]
  (when param
    (println "inside when")
    "return of when"))

(defn uso-de-nil
  [param]
  (nil? param))
