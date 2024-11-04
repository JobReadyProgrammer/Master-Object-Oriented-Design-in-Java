package subjects;

import observers.IObserver;


interface ISubject {

	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();

}
