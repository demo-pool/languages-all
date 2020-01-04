CXXFLAGS =	-O2 -g -Wall -fmessage-length=0

SRC=src/main/c/
	
all:	folder hello fizz-buzz

folder: 
	mkdir -p target

hello: hello.o
	$(CXX)	-o	target/hello	target/hello.o 

fizz-buzz: fizz-buzz.o	
	$(CXX)	-o	target/fizz-buzz	target/fizz-buzz.o

%.o:	$(PROJECT_ROOT)${SRC}%.c
	$(CC) -c $(CFLAGS) $(CPPFLAGS) -o target/$@ $<

clean:
	rm -rf target

	