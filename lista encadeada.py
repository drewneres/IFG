class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class ExternalLinkedList:
    def __init__(self):
        self.head = None

    def addNode(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node

    def displayList(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()

# Exemplo de uso
list = ExternalLinkedList()

list.addNode(10)
list.addNode(20)
list.addNode(30)

list.displayList()  # Saída: 10 20 30
