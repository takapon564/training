a = []
gets.chomp.to_i.times { a << gets.chomp.to_i }
puts a.uniq.sort[-2]
