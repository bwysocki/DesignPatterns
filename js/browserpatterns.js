/*
	1. Avoid access to DOM where possible
	2. Assign DOM elements to local values
	3. Use API selectors CSS where possible (document.querySelector faster than getElementsByClassName)
	4. Save 'length' to local var before iteration
	5. If you need to insert many elelemnts to DOM use documentFragment
	6. If you need to modify html, clone the node
	7. Use addEventListener during binding events
	8. By binding events you can use wrapper and inside src = e.target and src.nodeName.toLowerCas() === 'button' etc.
	9. Use webworkers for long running computations
	10. Divide js for 2 parts (init and lazy) (require.js)
	
*/

//Document Fragment
var frag, p, t;
frag = document.createDocumentFragment();

p = document.createElement('p');
t = document.createTextNode('aaaa');
p.appendChild(t);
frag.appendChild(p);

p = document.createElement('p');
t = document.createTextNode('bbb');
p.appendChild(t);
frag.appendChild(p);

document.body.appendChild(frag);

//Fragment cloning
var oldnode = document.getElementById('a');
clone = oldnode.cloneNode(true);
//modification here
oldnode.parentNode.replaceChild(clone, oldnode);