a=gets.chomp.to_i
b=gets.chomp.to_i
puts [(a - b).abs, (b + 10 - a).abs, (a + 10 - b)].min