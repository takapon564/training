# Qiita高校のある学年には、Nクラスの学級があり、各学級の男女の人数はそれぞれX(i), Y(i)となっている。
# この時、1クラスあたりの平均人数を男女別で出力せよ。
# ただし、小数点以下は切り捨てること。

number_of_class = gets
N = number_of_class.to_i
boys_total = []
girls_total = []
count = 0
while count < N do
    boys, girls = gets.split
    boys_total << boys.to_i
    girls_total << girls.to_i
    count += 1
end

puts (boys_total.sum / N).round
puts (girls_total.sum / N).round

x=y=0
(N=gets.to_i).times{a,b=gets.split.map &:to_i;x+=a;y+=b}
p x/N, y/N

