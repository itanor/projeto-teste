(defn primeiro-da-list []
  (first '(1 2 3)))
(defn resto-da-list []
  (rest '(1 2 3)))
(defn constroi-nova-list []
  (cons 0 '(1 2 3)))

(defn primeiro-do-vector []
  (first [4 5 6]))
(defn resto-do-vector []
  (rest [4 5 6]))
(defn constroi-novo-vector []
  (cons 0 [4 5 6]))

(defn primeiro-do-map []
  (first {:nome "Ocorrencia" :detalhe "Detalhe from hell"}))
(defn resto-do-map []
  (rest {:nome "Ocorrencia" :detalhe "Detalhe from hell"}))
(defn constroi-novo-map []
  (cons [:ativa true] {:nome "Ocorrencia" :detalhe "Detalhe from hell"}))

(defn primeiro-do-set []
  (first #{:the :quick :brown :fox}))
(defn resto-do-set []
  (rest #{:the :quick :brown :fox}))
(defn constroi-novo-set []
  (cons :jumped #{:the :quick :brown :fox}))
(defn novo-set-ordenado []
  (sorted-set :the :quick :brown :fox))

(defn conjuncao-para-lista []
  (conj '(1 2 3) :a)
)
(defn conjuncao-para-vetor []
  (conj [1 2 3] :a)
)
(defn into-para-lista []
  (into '(1 2 3) '(:a :b :c))
)
(defn into-para-vetor []
  (into [1 2 3] [:a :b :c])
)
