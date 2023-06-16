def gcd(a, b)
	diff = (a-b).abs
	i = 1
	solution = 1;
	
	a_divisors = []
    b_divisors = []

    loop do
        break if i > diff
        if(a % i == 0)
            a_divisors.push(i)
        end

        if(b % i == 0)
            b_divisors.push(i)
        end
        i += 1
    end
    if(a <b)
        solution = a_divisors.max
    else
        solution = b_divisors.max
    end
    return solution

end

puts gcd(3,5)
puts gcd(14,28)
puts gcd(4,18)