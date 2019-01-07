date_as_string  = gets
array = date_as_string.split('')
if array[3].to_i != 8
  array[3] = 8
  puts array.join
else
  puts date_as_string
end

