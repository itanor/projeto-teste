(defn square-corners [botton left size]
  (let [top (+ botton size)
        right (+ left size)]

  [[botton left] [top left] [top right] [botton right]])
)
