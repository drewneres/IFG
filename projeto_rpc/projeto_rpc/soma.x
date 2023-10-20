  struct Numeros{
      int a;
      int b;
};

program ADD_PROG {
	version ADD_VERS {
	    int add(Numeros nums) = 1;
	} = 1;
} = 0x23451111;
