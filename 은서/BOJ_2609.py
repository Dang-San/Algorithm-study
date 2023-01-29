#유클리드 호제법 사용
A, B = map(int,input().split())
a, b = A, B

# a > b일 때, a와 b의 최대공약수 = b와 a%b의 최대공약수
# A = x*gcd(a, b), B = y*gcd(a, b), A*B/gcd(a, b)를 해주면 최소공배수
while b != 0:
    a = a % b
    a, b = b, a

print(a)
print(A*B//a)
