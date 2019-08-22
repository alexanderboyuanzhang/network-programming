import socket


def netcat(hostname, port, content):
    res = ""
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((hostname, port))
    s.sendall(content)
    s.shutdown(socket.SHUT_WR)
    while 1:
        data = s.recv(1024)
        if data == "":
            break
        res = (repr(data))
    print "Connection closed."
    s.close()
    return res
