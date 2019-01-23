h={'2':1, '4':1, '5':2, '6':3, '8':1}
total = 0
n = gets.chomp.to_i
a = gets.chomp.split
i=0; n.times { total += (h.has_key?(a[i].to_sym) ? h[a[i].to_sym] : 0); i += 1 }
puts total