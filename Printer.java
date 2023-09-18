class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}

class Answer {
    public Node head;

    public void reverse() {

        // Введите свое решение ниже

        Node curr = head.next;
        head.next = null;

        while (curr != null) {
            Node nextN = curr.next;
            // if (nextN != null)
                // System.out.println(nextN.val + " - nextN");
            curr.next = head;
            // System.out.println(curr.next.val + " - curr.next");
            head = curr;
            // System.out.println(head.val + " - head");
            curr = nextN;
            // if (curr != null)
                // System.out.println(curr.val + " - curr");
            // System.out.println("------------------");
        }
        // Node temp = head.next;
        // System.out.println("temp - " + temp.val);
        // // System.out.println("current2next - " + current.next.next.val);
        // // Node temp = current.next;
        // // System.out.println(temp.val + " - temp, " + current.next.val + " -
        // current.next");
        // head.next = null;
        // Node bigl = temp;
        // System.out.println("bigl - " + bigl.val);
        // System.out.println();

        // Node current = head;

        // while (temp != null) {

        // head = temp;
        // temp.next =
        // // head = temp;
        // // System.out.println(head.val + " - head");
        // head.next = current;
        // System.out.println("head.next - " + head.next.val);
        // // current.next = bigl;
        // // System.out.println("bigl - " + bigl.val);

        // current = current.next;
        // System.out.println(current.val + " - current");
        // temp = current.next;
        // System.out.println("temp - " + temp.val);
        // System.out.println("----------------");

        // }

        // // System.out.println(head.next.val);
        // // Node currentNode = head.next;
        // // temp = currentNode.next;
        // // System.out.println(currentNode.val + " - current");

        // // while (currentNode != null) {
        // // System.out.print(currentNode.val + " ");
        // // currentNode = currentNode.next;
        // // }

        // // Node previousNode = null;
        // // while (currentNode != null) {
        // // Node nextNode = currentNode.next;
        // // currentNode.next = previousNode;
        // // previousNode = currentNode;
        // // currentNode = nextNode;
        // // }

        // // Node newList = new Node(incomListNode.val);
        // // System.out.println(newList.val);
        // // incomListNode = incomListNode.next;
        // // while (incomListNode != null) {

        // // System.out.println("входящее значение " + incomListNode.val);
        // // newList.next = new Node(newList.val);
        // // System.out.println("значение след.элемента нового списка " +
        // // newList.next.val);
        // // System.out.println("при этом значение головы newList: " + newList.val);

        // // newList = incomListNode;
        // // System.out.println("добавлено новое значение в начало newList: " +
        // // newList.val);

        // // incomListNode = incomListNode.next;

        // // // System.out.println(head);
        // // // newList = ;
        // // // newList = head;
        // // System.out.println("------------------------------");
        // // }

        // // while(previousNode!=null)

        // // {
        // // System.out.print(previousNode.val + " ");
        // // previousNode = previousNode.next;
        // // }

        // // head = null;

        // if(head==null)
        // {
        // System.out.println("Списко пуст");
        // }else
        // {
        // while (head != null) {
        // System.out.print(head.val + " ");
        // head = head.next;
        // }
        // }while(previousNode!=null)
        // {
        // {
        // head = previousNode;
        // head.next = previousNode.next;
        // previousNode = previousNode.next;
        // head = head.next;
        // }
        // }

        // while (currentNode != null) {
        // head = currentNode;
        // System.out.println("Значение элемента incomListNode: " + incomListNode.val);

        // System.out.println(currentNode.val);
        // currentNode = currentNode.next;
        // incomListNode = incomListNode.next;
        // }
        // head = newList;

        // Node previous = null;
        // Node current = head;
        // while (currentNode != null) {
        // Node nextElement = currentNode.next;
        // currentNode.next =currentNode;
        // previousNode = currentNode;
        // currentNode = nextElement;
        // }
    }
}

public class Printer {
    public static void main(String[] args) {
        // Создаем связанный список 1 -> 2 -> 3 -> 4
        Node head;
        if (args.length == 0) {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
        } else {
            head = new Node(Integer.parseInt(args[0]));
            head.next = new Node(Integer.parseInt(args[1]));
            head.next.next = new Node(Integer.parseInt(args[2]));
            head.next.next.next = new Node(Integer.parseInt(args[3]));
        }

        // Сохраняем голову списка в поле класса Answer
        Answer ans = new Answer();
        ans.head = head;
        // Инвертируем порядок элементов списка
        ans.reverse();

        // Выводим инвертированный порядок элементов списка
        Node current = ans.head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}