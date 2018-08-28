
public class Chapter_1_Questions {
	public Chapter_1_Questions()
	{
	}
	public String[][] Questions()
	{
		String[][] questionsArray = new String[47][4];
		questionsArray[0][0] = "What is an operating system?";
		questionsArray[0][1] = "0";
		questionsArray[0][2] = "20000";  //Sleep Time
		questionsArray[0][3] = "NO";  
		
		questionsArray[1][0] = "What are the main components of a modern computer?";
		questionsArray[1][1] = "1";
		questionsArray[1][2] = "15000";  //Sleep Time
		questionsArray[1][3] = "NO";  
		
		questionsArray[2][0] = "One of modern computer's main components: \n "
							+ "1. One or more processors \n -> Management through _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ management, and the management of processes on the machine.";
		questionsArray[2][1] = "2";
		questionsArray[2][2] = "12000";  //Sleep Time
		questionsArray[2][3] = "NO";  
		
		questionsArray[3][0] = "One of modern computer's main components: \n "
							+ "2. Main _ _ _ _ _ _ \n -> Allocation of _ _ _ _ _ _ that is assigned to processes, Adress spaces and Virtual _ _ _ _ _ _";
		questionsArray[3][1] = "3";
		questionsArray[3][2] = "10000";  
		questionsArray[3][3] = "NO";  
		
		questionsArray[4][0] = "One of modern computer's main components: \n "
							+ "3. _ _ _ _ _ \n -> Files systems, allocation of blocks to files.";
		questionsArray[4][1] = "4";
		questionsArray[4][2] = "10000";  //Sleep Time
		questionsArray[4][3] = "NO";  
		
		questionsArray[5][0] = "One of modern computer's main components: \n "
							+ "4. Various _ _   _ _ _ _ _ _ _  \n -> The interaction between the OS and the hardware, interrupts, etc.";
		questionsArray[5][1] = "5";
		questionsArray[5][2] = "12000";  //Sleep Time
		questionsArray[5][3] = "NO";  
		
		questionsArray[6][0] = "What are the main components of a modern computer? \n"
							+ "1. _ _ _ _ _ _ _ _ _ _  \n"
							+ "2. _ _ _ _ - _ _ _ _ _ _  \n"
							+ "3. _ _ _ _ _  \n"
							+ "4. _ _ - _ _ _ _ _ _ _  \n";
		questionsArray[6][1] = "6";
		questionsArray[6][2] = "30000";  //Sleep Time
		questionsArray[6][3] = "NO";  
		
		questionsArray[7][0] = "The operating acts as _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ and _ _ _ _ _ _ _ _ - _ _ _ _ _ _ _ ";
		questionsArray[7][1] = "7";
		questionsArray[7][2] = "20000";  //Sleep Time
		
		questionsArray[8][0] = "The operating system as an extended machine: Th OS fits in _ _ _ _ _ _   _ _ _ _";
		questionsArray[8][1] = "8";
		questionsArray[8][2] = "10000";  //Sleep Time
		questionsArray[8][3] = "Where_the_OS_fits_in - 3.PNG";  
		
		questionsArray[9][0] = "Modes of operation of most computers: \n"
							+ "1. _ _ _ _ _ _ - _ _ _ _ \n"
							+ "2. _ _ _ _ - _ _ _ _";
		questionsArray[9][1] = "9";
		questionsArray[9][2] = "20000";  //Sleep Time
		questionsArray[9][3] = "Where_the_OS_fits_in - 2.PNG";  
		
		questionsArray[10][0] = "kernel mode is sometimes called the _ _ _ _ _ _ _ _ _ _   _ _ _ _";
		questionsArray[10][1] = "10";
		questionsArray[10][2] = "15000";  //Sleep Time
		questionsArray[10][3] = "NO";  
		
		questionsArray[11][0] = "In kernel model, the operating system has complete _ _ _ _ _ _ to all the hardware \n"
							+ "and can _ _ _ _ _ _ _ any instruction the machine is capable of executing.";
		questionsArray[11][1] = "11";
		questionsArray[11][2] = "15000";  //Sleep Time
		questionsArray[11][3] = "NO";  

		questionsArray[12][0] = "The rest of the software runs in _ _ _ _   _ _ _ _, in which only a subset of instructions is available.";
		questionsArray[12][1] = "12";
		questionsArray[12][2] = "12000";  //Sleep Time
		questionsArray[12][3] = "NO";  
		
		questionsArray[13][0] = "The operating system as a resource manager: \n"
							+ "1. Allows multiple programs to _ _ _ at the same time.";
		questionsArray[13][1] = "13";
		questionsArray[13][2] = "8000";  //Sleep Time
		questionsArray[13][3] = "NO";  
		
		questionsArray[14][0] = "The operating system as a resource manager: \n"
							+ "2. Manage and _ _ _ _ _ _ _ memory, IO devices, and _ _ _ _ _ resources.";
		questionsArray[14][1] = "14";
		questionsArray[14][2] = "10000";  //Sleep Time
		questionsArray[14][3] = "NO";  
		
		questionsArray[14][0] = "The operating system as a resource manager: \n"
							+ "3. Include _ _ _ _ _ _ _ _ _ _(sharing) resources in two ways: \n"
							+ "a. time\n"
							+ "b. space\n";
		questionsArray[15][1] = "15";							
		questionsArray[15][2] = "12000";  //Sleep Time
		questionsArray[15][3] = "NO";  
		
		questionsArray[16][0] = "The operating system as a resource manager: \n"
							+ "3. Include multiplexing(sharing) resources in two ways: \n"
							+ "a. _ _ _ _\n"
							+ "b. space\n";
		questionsArray[16][1] = "16";
		questionsArray[16][2] = "10000";  //Sleep Time
		questionsArray[16][3] = "NO";  
		
		questionsArray[17][0] = "The operating system as a resource manager: \n"
							+ "3. Include multiplexing(sharing) resources in two ways: \n"
							+ "a. time\n"
							+ "b. _ _ _ _\n";
		questionsArray[17][1] = "17";
		questionsArray[17][2] = "10000";  //Sleep Time
		questionsArray[17][3] = "NO";  
		
		questionsArray[18][0] = "When a resource is multiplexed: \n"
							+ "1. Different programs or users take _ _ _ _ _ using it.";
		questionsArray[18][1] = "18";
		questionsArray[18][2] = "10000";  //Sleep Time
		questionsArray[18][3] = "NO";  
		
		questionsArray[19][0] = "When a resource is multiplex: \n"
							+ "2. First one of them gets to _ _ _ the resource, then the other, and so on.";
		questionsArray[19][1] = "19";
		questionsArray[19][2] = "10000";  //Sleep Time
		questionsArray[19][3] = "NO";  

		questionsArray[20][0] = "When a computer resource is multiplexed: \n"
							+ "1. Instead of programs taking turns, each one gets _ _ _ _ of the resource.";
		questionsArray[20][1] = "20";
		questionsArray[20][2] = "10000";  //Sleep Time
		questionsArray[20][3] = "NO";  

		questionsArray[21][0] = "When a computer resource is multiplexed: \n"
							+ "2. For example, main memory is normarlly _ _ _ _ _ _ _ up among several _ _ _ _ _ _ _ programs\n"
							+ "so each can be _ _ _ _ _ _ _ _ at the same time.";
		questionsArray[21][1] = "21";
		questionsArray[21][2] = "15000";  //Sleep Time
		questionsArray[21][3] = "NO";  

		questionsArray[22][0] = "Computer Hardware Review: \n "
							+ "An _ _ _ _ _ _ _ _ _  _ _ _ _ _ _ is intimately tied to the hardware of the computer in runs on.";
		questionsArray[22][1] = "22";
		questionsArray[22][2] = "20000";  //Sleep Time
		questionsArray[22][3] = "NO";  

		questionsArray[23][0] = "Computer Hardware Review: \n"
							+ "An OS _ _ _ _ _ _ _ the computer's instruction set and _ _ _ _ _ _ _ resources.";
		questionsArray[23][1] = "23";
		questionsArray[23][2] = "20000";  //Sleep Time
		questionsArray[23][3] = "NO";  

		questionsArray[24][0] = "Computer Hardware review: \n"
							+ "To work with it must know a great about the _ _ _ _ _ _ _ _.";
		questionsArray[24][1] = "24";
		questionsArray[24][2] = "15000";  //Sleep Time
		questionsArray[24][3] = "NO";  

		questionsArray[25][0] = "Components of a simple personal computer: \n"
							+ "Fill in the empty block on the diagram: _ _ _ _ _ _";
		questionsArray[25][1] = "25";
		questionsArray[25][2] = "10000";  //Sleep Time
		questionsArray[25][3] = "Components_of_PC.PNG";  

		questionsArray[26][0] = "Components of a simple personal computer: \n"
							+ "Fill in the empty block on the diagram: _ _ _ _ _ _";
		questionsArray[26][1] = "26";
		questionsArray[26][2] = "10000";  //Sleep Time
		questionsArray[26][3] = "Components_of_PC - 2.PNG";  

		questionsArray[27][0] = "Processors: \n"
							+ "The brain of the computer is th: _ _ _";
		questionsArray[27][1] = "27";
		questionsArray[27][2] = "10000";  //Sleep Time
		questionsArray[27][3] = "NO";  

		questionsArray[28][0] = "Processor: \n"
							+ "It fetches the _ _ _ _ _ _ _ _ _ _ _ _ from memory and executes them";
		questionsArray[28][1] = "28";
		questionsArray[28][2] = "15000";  //Sleep Time
		questionsArray[28][3] = "NO";  

		questionsArray[29][0] = "Processors: \n"
							+ "The basic life cycle of a CPU: \n"
							+ "1. _ _ _ _ _ the first instruction from memory. \n"
							+ "2. _ _ _ _ _ _ it to determine its type and operands. \n"
							+ "3. _ _ _ _ _ _ _ it.";
		questionsArray[29][1] = "29";
		questionsArray[29][2] = "25000";  //Sleep Time
		questionsArray[29][3] = "NO";  

		questionsArray[30][0] = "Processors: \n"
							+ "The CPU cycle is repeated until the _ _ _ _ _ _ _ finishes.";
		questionsArray[30][1] = "30";
		questionsArray[30][2] = "15000";  //Sleep Time
		questionsArray[30][3] = "NO";  

		questionsArray[31][0] = "Processors: \n"
							+ "Because accessing memory to get an instruction takes much longer than "
							+ "executing an instruction,all CPUs contain some _ _ _ _ _ _ _ _ _ inside to hold "
							+ "key variables and temporary results.";
		questionsArray[31][1] = "31";
		questionsArray[31][2] = "20000";  //Sleep Time
		questionsArray[31][3] = "NO";  

		questionsArray[32][0] = "Some of the registers in a typical CPU: \n"
							+ "1. _ _ _ _ _ _ _  _ _ _ _ _ _ _ \n"
							+ "-> Contains the memory address of the next instruction to be fetched.";
		questionsArray[32][1] = "32";
		questionsArray[32][2] = "30000";  //Sleep Time
		questionsArray[32][3] = "NO";  

		questionsArray[33][0] = "Some of the registers in a typical CPU: \n"
							+ "2. _ _ _ _ _  _ _ _ _ _ _ _ \n"
							+ "-> Points to the top of the current stack in memory. \n"
							+ "-> The stack contains the frame for each procedure that has been entered but not yet exited.";
		questionsArray[33][1] = "33";
		questionsArray[33][2] = "30000";  //Sleep Time
		questionsArray[33][3] = "NO";  

		questionsArray[34][0] = "Some of the registers in a typical CPU: \n"
							+ "3. _ _ _ _ _ _ _  _ _ _ _ _ _  _ _ _ _ \n"
							+ "-> Contains the condition code bits, which are set by comparision instruction, the CPU  priority,"
							+ "the mode(user or kernel), and various other control.";
		questionsArray[34][1] = "34";
		questionsArray[34][2] = "30000";  //Sleep Time
		questionsArray[24][3] = "NO";  

		questionsArray[35][0] = "To improve performance: \n"
							+ "-> CPU designers have long abondoned the simple model of fetching, decoding, and executing "
							+ "one _ _ _ _ _ _ _ _ _ _ _ at a time";
		questionsArray[35][1] = "35";
		questionsArray[35][2] = "30000";  //Sleep Time
		questionsArray[35][3] = "NO";  

		questionsArray[36][0] = "To improve performance: \n"
							+ "-> Modern CPUs have _ _ _ _ _ _ _ _ _ _ for executing more than one instruction at the same time.";
		questionsArray[36][1] = "36";
		questionsArray[36][2] = "30000";  //Sleep Time
		questionsArray[36][3] = "NO";  

		questionsArray[37][0] = "To improve performance: \n"
							+ "-> As an example,  a CPU might have seperate fetch, decode and execute units, so that while  it is "
							+ "executing instruction _, it could also be decoding instruction _ _ _ and fetching instruction _ _ _.";
		questionsArray[37][1] = "37";
		questionsArray[37][2] = "30000";  //Sleep Time
		questionsArray[37][3] = "NO";  

		questionsArray[38][0] = "To improve performance: \n"
							+ "-> The organization of fetching instruction n+2, decoding instruction n+1 and executing  instruction n "
							+ "is know as _ _ _ _ _ _ _ _";
		questionsArray[38][1] = "38";
		questionsArray[38][2] = "30000";  //Sleep Time
		questionsArray[38][3] = "NO";  

		questionsArray[39][0] = "A SuperScalar CPU: \n"
							+ "-> Multiple execution _ _ _ _ _ are present.";
		questionsArray[39][1] = "39";
		questionsArray[39][2] = "15000";  //Sleep Time
		questionsArray[39][3] = "NO";  

		questionsArray[40][0] = "A SuperScalar CPU: \n"
							+ "-> Two or more instructions are fetched at once, decoded and dumped into the _ _ _ _ _ _ _  _ _ _ _ _ _  until they can be executed.";
		questionsArray[40][1] = "40";
		questionsArray[40][2] = "15000";  //Sleep Time
		questionsArray[40][3] = "Holding_Buffer.PNG";  

		questionsArray[41][0] = "A SuperScalar CPU: \n"
							+ "-> An implication for this design is that _ _ _ _ _ _ _ instructions are often executed out of order.";
		questionsArray[41][1] = "41";
		questionsArray[41][2] = "15000";  //Sleep Time
		questionsArray[41][3] = "NO";  

		questionsArray[42][0] = "Multithreaded and Multicore chips: \n"
							+ "-> Moore's law states that the number of transistors on a chip doubles every: ";
		questionsArray[42][1] = "42";
		questionsArray[42][2] = "10000";  //Sleep Time
		questionsArray[42][3] = "NO";  

		questionsArray[43][0] = "Multithreaded and Multicore chips: \n"
							+ "Moore's law has held for over _  _ _ _ _ _ _ _ now and is expected to hold for at least one more decade";
		questionsArray[43][1] = "43";
		questionsArray[43][2] = "15000";  //Sleep Time
		questionsArray[43][3] = "NO";  

		questionsArray[44][0] = "Multithreaded and Multicore chips: \n"
							+ "-> After one decade from now, the number of atoms per _ _ _ _ _ _ _ _ _ _ _ will become small and quantum mechanics "
							+ "will start to play a big role, preventing further shrinkage of transistor sizes.";
		questionsArray[44][1] = "44";
		questionsArray[44][2] = "25000";  //Sleep Time
		questionsArray[44][3] = "NO";  

		questionsArray[45][0] = "The usage of abundance of transistors: \n"
							+ "1. Superscalar _ _ _ _ _ _ _ _ _ _ _ _ _, with multiple functions.";
		questionsArray[45][1] = "45";
		questionsArray[45][2] = "20000";  //Sleep Time
		questionsArray[45][3] = "NO";  
		
		questionsArray[46][0] = "The usage of abundance of transistors: \n"
							+ "2. Put bigger catches on the CPU _ _ _ _.";
		questionsArray[46][1] = "46";
		questionsArray[46][2] = "3s0000";  //Sleep Time
		questionsArray[46][3] = "NO";  
		
		return questionsArray;
	}
	
	public String[] Answers()
	{
		String[] AnswersArray  = new String[47];
		AnswersArray[0] = "0,3";
		AnswersArray[1] = "1,4";
		AnswersArray[2] = "multiprocessor";
		AnswersArray[3] = "memory";
		AnswersArray[4] = "disks";
		AnswersArray[5] = "io devices";
		AnswersArray[6] = "processors main-memory disks io-devices";
		AnswersArray[7] = "extended-machine resource-manager";
		AnswersArray[8] = "kernel mode";
		AnswersArray[9] = "kernel-mode user-mode";
		AnswersArray[10] = "supervisor mode";
		AnswersArray[11] = "access execute";
		AnswersArray[12] = "user mode";
		AnswersArray[13] = "run";
		AnswersArray[14] = "protect other";
		AnswersArray[15] = "multiplexing";
		AnswersArray[16] = "time";
		AnswersArray[17] = "space";
		AnswersArray[18] = "turns";
		AnswersArray[19] = "use";
		AnswersArray[20] = "part";
		AnswersArray[21] = "divided running resident";
		AnswersArray[22] = "operating system";
		AnswersArray[23] = "extends manages";
		AnswersArray[24] = "software";
		AnswersArray[25] = "memory";
		AnswersArray[26] = "cpu mmu";
		AnswersArray[27] = "cpu";
		AnswersArray[28] = "instructions";
		AnswersArray[29] = "fetch decode execute";
		AnswersArray[30] = "program";
		AnswersArray[31] = "registers";
		AnswersArray[32] = "program counter";
		AnswersArray[33] = "stack pointer";
		AnswersArray[34] = "program status word";
		AnswersArray[35] = "instruction";
		AnswersArray[36] = "facilities";
		AnswersArray[37] = "n n+1 n+2";
		AnswersArray[38] = "pipeline";
		AnswersArray[39] = "units";
		AnswersArray[40] = "holding buffer";
		AnswersArray[41] = "program";
		AnswersArray[42] = "2,2";
		AnswersArray[43] = "3,3";
		AnswersArray[44] = "transistors";
		AnswersArray[45] = "architectures";
		AnswersArray[46] = "chip";
		
		return AnswersArray;
	}
	public String[] MultiAnswers()
	{
		String[] multiAnswersArray = new String[4];
		multiAnswersArray[0] = " The operating system is the software component responsible for managing all components \n      of a computer and to provide user files with a better, simpler and cleaner model of the computer.\n"
							+  "~  The operating system is the software component responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.\n"
							+  "~ The operating system is the software layer responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.\n "
							+  "~ The operating system is the software component responsible for managing all components \n      of a computer and to provide user programs with a better, simpler and cleaner model of the computer.";
		multiAnswersArray[1] = " One or more processors, Capacitors, Disks and Various IO Devices.\n"
							+  "~ Disk, Main memory, Disks and Capacitors.\n"
							+  "~ One or more processors, hardware, Disks and Various IO Devices.\n"
							+  "~ Various IO Devices, Main Memory, Disks and One or more processors.";
		multiAnswersArray[2] = " 24 Months. ~ 18 Months.~ 6 Months.~ 12 Months.";
		multiAnswersArray[3] = " 10 decades. ~ 1 decades.~ 3 decades.~ 2 decades.";
	
		return multiAnswersArray;
	}
}
