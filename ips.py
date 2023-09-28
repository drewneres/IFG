import re
def regex(pattern, string):
	capt = re.match(pattern, string)
	if bool(capt):
		return capt.group()
	return False

ip_v = ''
ip_i = ''
list = {'200.135.80.9',
        '192.168.1.1',
        '8.35.67.74',
        '257.32.4.5',
        '85.345.1.2',
        '1.2.3.4',
        '9.8.234.5',
        '192.168.0.256',
}
for ip in list:
	if ip == '0.0.0.0':
		ip_v = ip_v + '\n' + ip
	elif regex('^(([1-8]\.|[1-8][0-9]\.|1[0-9][0-9]\.|2[0-4][0-9]\.|25[0-5]\.)([0-9]\.|[1-9][0-9]\.|1[0-9][0-9]\.|2[0-4][0-9]\.|25[0-5]\.)([0-9]\.|[1-9][0-9]\.|1[0-9][0-9]\.|2[0-4][0-9]\.|25[0-5]\.)([0-9]\.|[1-9][0-9]\.|1[0-9][0-9]\.|2[0-4][0-8]\.|25[0-5]\.))$', ip + '.'):
		ip_v = ip_v + '\n' + ip
	else:
		ip_i = ip_i + '\n' + ip

print('[Endereços válidos:]')
print(ip_v)
print('[Endereços inválidos:]')
print(ip_i)
