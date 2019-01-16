#入力した文字列より小さい文字をなんでもいいので出力。
a=('a'..'z').to_a
n=gets.chomp
puts a[0]<n ? a[0] : -1