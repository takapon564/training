a=[]
gets.chomp.to_i.times { a<<gets.chomp }
count = Hash.new(0)
a.each { |elem| count[elem] +=1}
puts count.key(count.values.max)